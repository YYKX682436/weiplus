package yz1;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedInputStream f550028a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f550029b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final yz1.j f550030c = new yz1.j();

    public c(java.io.BufferedInputStream bufferedInputStream) {
        this.f550028a = bufferedInputStream;
    }

    public java.lang.String a() {
        while (true) {
            int read = this.f550028a.read();
            if (read < 0) {
                return null;
            }
            char c17 = (char) read;
            yz1.j jVar = this.f550030c;
            int i17 = jVar.f550041a;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        throw new java.lang.IllegalArgumentException("Unknown state: " + jVar.f550041a);
                    }
                    if (c17 == '\r') {
                        jVar.f550041a = 2;
                    } else {
                        jVar.f550041a = 1;
                    }
                } else if (c17 == '\n') {
                    jVar.f550041a = 3;
                } else {
                    jVar.f550041a = 1;
                }
            } else if (c17 == '\r') {
                jVar.f550041a = 2;
            }
            int i18 = jVar.f550041a;
            java.lang.StringBuilder sb6 = this.f550029b;
            if (i18 == 1) {
                sb6.append(c17);
            } else if (i18 == 3) {
                java.lang.String sb7 = sb6.toString();
                sb6.setLength(0);
                return sb7;
            }
        }
    }
}

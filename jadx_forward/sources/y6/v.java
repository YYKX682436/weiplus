package y6;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final q7.k f541146a = new q7.k(1000);

    /* renamed from: b, reason: collision with root package name */
    public final m3.e f541147b = r7.h.a(10, new y6.t(this));

    public java.lang.String a(t6.h hVar) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        synchronized (this.f541146a) {
            q7.k kVar = this.f541146a;
            synchronized (kVar) {
                obj = ((java.util.LinkedHashMap) kVar.f441835a).get(hVar);
            }
            str = (java.lang.String) obj;
        }
        if (str == null) {
            java.lang.Object a17 = ((r7.e) this.f541147b).a();
            q7.n.b(a17);
            y6.u uVar = (y6.u) a17;
            try {
                hVar.b(uVar.f541144d);
                byte[] digest = uVar.f541144d.digest();
                char[] cArr = q7.p.f441844b;
                synchronized (cArr) {
                    for (int i17 = 0; i17 < digest.length; i17++) {
                        int i18 = digest[i17] & 255;
                        int i19 = i17 * 2;
                        char[] cArr2 = q7.p.f441843a;
                        cArr[i19] = cArr2[i18 >>> 4];
                        cArr[i19 + 1] = cArr2[i18 & 15];
                    }
                    str2 = new java.lang.String(cArr);
                }
                ((r7.e) this.f541147b).b(uVar);
                str = str2;
            } catch (java.lang.Throwable th6) {
                ((r7.e) this.f541147b).b(uVar);
                throw th6;
            }
        }
        synchronized (this.f541146a) {
            this.f541146a.c(hVar, str);
        }
        return str;
    }
}

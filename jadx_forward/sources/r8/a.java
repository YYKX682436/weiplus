package r8;

/* loaded from: classes15.dex */
public final class a extends r8.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f474795e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f474796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f474797c;

    /* renamed from: d, reason: collision with root package name */
    public int f474798d;

    public boolean a(t9.p pVar) {
        if (this.f474796b) {
            pVar.x(1);
        } else {
            int m17 = pVar.m();
            int i17 = (m17 >> 4) & 15;
            this.f474798d = i17;
            q8.o oVar = this.f474814a;
            if (i17 == 2) {
                oVar.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(null, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e, null, -1, -1, 1, f474795e[(m17 >> 2) & 3], null, null, 0, null));
                this.f474797c = true;
            } else if (i17 == 7 || i17 == 8) {
                oVar.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.b(null, i17 == 7 ? com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54247x7afda88a : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54256x7b031cfe, null, -1, -1, 1, 8000, (m17 & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.f474797c = true;
            } else if (i17 != 10) {
                throw new r8.d("Audio format not supported: " + this.f474798d);
            }
            this.f474796b = true;
        }
        return true;
    }

    public void b(t9.p pVar, long j17) {
        int i17 = this.f474798d;
        q8.o oVar = this.f474814a;
        if (i17 == 2) {
            int i18 = pVar.f498075c - pVar.f498074b;
            oVar.a(pVar, i18);
            this.f474814a.b(j17, 1, i18, 0, null);
            return;
        }
        int m17 = pVar.m();
        if (m17 != 0 || this.f474797c) {
            if (this.f474798d != 10 || m17 == 1) {
                int i19 = pVar.f498075c - pVar.f498074b;
                oVar.a(pVar, i19);
                this.f474814a.b(j17, 1, i19, 0, null);
                return;
            }
            return;
        }
        int i27 = pVar.f498075c - pVar.f498074b;
        byte[] bArr = new byte[i27];
        pVar.b(bArr, 0, i27);
        android.util.Pair b17 = t9.e.b(bArr);
        oVar.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.c(null, "audio/mp4a-latm", null, -1, -1, ((java.lang.Integer) b17.second).intValue(), ((java.lang.Integer) b17.first).intValue(), java.util.Collections.singletonList(bArr), null, 0, null));
        this.f474797c = true;
    }
}

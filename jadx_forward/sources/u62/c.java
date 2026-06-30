package u62;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f506477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f506478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v25.b f506479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f506480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14 f506481h;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14 c13502x57397e14, int i17, long j17, v25.b bVar, java.lang.String[] strArr) {
        this.f506481h = c13502x57397e14;
        this.f506477d = i17;
        this.f506478e = j17;
        this.f506479f = bVar;
        this.f506480g = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String[] strArr = this.f506480g;
        v25.b bVar = this.f506479f;
        com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14 c13502x57397e14 = this.f506481h;
        int i17 = this.f506477d;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 Bi = n62.k.Di().Bi(this.f506478e);
            if (Bi == null || ((int) Bi.E2) <= 0) {
                c13502x57397e14.k(3);
                bVar.a();
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5397xdb341c08 c5397xdb341c08 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5397xdb341c08();
            am.o8 o8Var = c5397xdb341c08.f135739g;
            o8Var.f89049a = 1;
            o8Var.f89050b = Bi.d1();
            if (!c5397xdb341c08.e()) {
                c13502x57397e14.k(4);
                bVar.a();
                return;
            }
            c13502x57397e14.f181424o = new android.database.MatrixCursor(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14.f181420w);
            int i18 = (int) Bi.E2;
            am.p8 p8Var = c5397xdb341c08.f135740h;
            if (i18 <= 0 || !p8Var.f89141a) {
                c13502x57397e14.f181424o.addRow(new java.lang.Object[]{strArr[1], 2, "0"});
                c13502x57397e14.k(3);
            } else {
                c13502x57397e14.f181424o.addRow(new java.lang.Object[]{strArr[1], 1, "0"});
                c13502x57397e14.k(0);
            }
            boolean z17 = p8Var.f89141a;
            java.lang.String str = p8Var.f89142b;
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5397xdb341c08 c5397xdb341c082 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5397xdb341c08();
            c5397xdb341c082.f135739g.f89049a = 2;
            if (!c5397xdb341c082.e()) {
                c13502x57397e14.k(4);
                bVar.a();
                return;
            }
            am.p8 p8Var2 = c5397xdb341c082.f135740h;
            java.lang.String str2 = p8Var2.f89142b;
            c13502x57397e14.f181424o = new android.database.MatrixCursor(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14.f181420w);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5403xedb7e971 c5403xedb7e971 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5403xedb7e971();
            c5403xedb7e971.f135748g.f89900a = str2;
            if (!c5403xedb7e971.e()) {
                c13502x57397e14.k(4);
                c13502x57397e14.f181424o.close();
                bVar.a();
                return;
            }
            am.y8 y8Var = c5403xedb7e971.f135749h;
            long j17 = y8Var.f89976a;
            long j18 = y8Var.f89976a;
            if (j18 > 0) {
                try {
                    if (p8Var2.f89141a) {
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        if (context == null || !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
                            c13502x57397e14.f181424o.addRow(new java.lang.Object[]{strArr[1], 6, com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b(j18)});
                            c13502x57397e14.k(4);
                        } else {
                            c13502x57397e14.f181424o.addRow(new java.lang.Object[]{strArr[1], 1, com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b(j18)});
                            c13502x57397e14.k(0);
                        }
                    } else {
                        c13502x57397e14.f181424o.addRow(new java.lang.Object[]{strArr[1], 4, com.p314xaae8f345.mm.p1006xc5476f33.ext.key.C13497xe8ed7151.b(j18)});
                        c13502x57397e14.k(4);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtControlProviderMsg", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtControlProviderMsg", e17, "", new java.lang.Object[0]);
                    c13502x57397e14.k(4);
                }
            } else {
                c13502x57397e14.k(3);
            }
        }
        bVar.a();
    }
}

package c01;

/* loaded from: classes12.dex */
public class m7 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c01.r7 f37330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(c01.r7 r7Var, android.os.Looper looper) {
        super(looper);
        this.f37330a = r7Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        c01.r7 r7Var = this.f37330a;
        try {
            if (r7Var.f37419e != null) {
                c01.q7 q7Var = (c01.q7) message.obj;
                int i17 = message.arg2;
                boolean z17 = q7Var.f37396c;
                java.lang.String str = q7Var.f37395b;
                if (z17 && m11.n1.g()) {
                    java.lang.String str2 = q7Var.f37394a;
                    java.lang.String str3 = null;
                    try {
                        if (m11.n1.f(str2)) {
                            java.lang.String lowerCase = android.net.Uri.parse(str2).getQueryParameter("wxtype").toLowerCase();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(lowerCase)) {
                                str3 = lowerCase.toLowerCase();
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
                    if (i07 == null) {
                        c01.r7.a(r7Var, 14L, 1L);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        if (str3.toLowerCase().contains("png")) {
                            com.tencent.mm.sdk.platformtools.x.D0(i07, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
                        } else {
                            com.tencent.mm.sdk.platformtools.x.D0(i07, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        }
                    }
                }
                int k17 = (int) com.tencent.mm.vfs.w6.k(str);
                if (k17 > 0 && gm0.j1.a()) {
                    ((com.tencent.mm.modelstat.s0) c01.n8.f37348a).a(k17, 0, 0);
                }
                com.tencent.mm.sdk.platformtools.u3.h(new c01.l7(this, q7Var, i17));
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.GetPicService", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}

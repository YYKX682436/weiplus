package c01;

/* loaded from: classes12.dex */
public class m7 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c01.r7 f118863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(c01.r7 r7Var, android.os.Looper looper) {
        super(looper);
        this.f118863a = r7Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        c01.r7 r7Var = this.f118863a;
        try {
            if (r7Var.f118952e != null) {
                c01.q7 q7Var = (c01.q7) message.obj;
                int i17 = message.arg2;
                boolean z17 = q7Var.f118929c;
                java.lang.String str = q7Var.f118928b;
                if (z17 && m11.n1.g()) {
                    java.lang.String str2 = q7Var.f118927a;
                    java.lang.String str3 = null;
                    try {
                        if (m11.n1.f(str2)) {
                            java.lang.String lowerCase = android.net.Uri.parse(str2).getQueryParameter("wxtype").toLowerCase();
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lowerCase)) {
                                str3 = lowerCase.toLowerCase();
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str);
                    if (i07 == null) {
                        c01.r7.a(r7Var, 14L, 1L);
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        if (str3.toLowerCase().contains("png")) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(i07, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
                        } else {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(i07, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        }
                    }
                }
                int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
                if (k17 > 0 && gm0.j1.a()) {
                    ((com.p314xaae8f345.mm.p959x883644fd.s0) c01.n8.f118881a).a(k17, 0, 0);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new c01.l7(this, q7Var, i17));
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetPicService", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}

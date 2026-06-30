package zw1;

/* loaded from: classes8.dex */
public class g3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zw1.i3 f558170a;

    public g3(zw1.i3 i3Var) {
        this.f558170a = i3Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeSettingUI", "CgiF2fShortTermQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        zw1.i3 i3Var = this.f558170a;
        if (!i3Var.f558196d.isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5 activityC13148x64d0f1c5 = i3Var.f558196d;
            if (!activityC13148x64d0f1c5.isDestroyed() && (fVar = fVar2.f152151d) != null) {
                if (fVar2.f152148a != 0 || fVar2.f152149b != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13148x64d0f1c5.V6(activityC13148x64d0f1c5, fVar2.f152150c);
                } else if (((r45.lw) fVar).f461403f == 2) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("ftf_pay_url", ((r45.lw) fVar2.f152151d).f461401d);
                    intent.putExtra("key_error_level", ((r45.lw) fVar2.f152151d).f461402e);
                    intent.putExtra("ftf_fixed_fee", (int) ((r45.lw) fVar2.f152151d).f461404g);
                    intent.putExtra("ftf_fixed_desc", ((r45.lw) fVar2.f152151d).f461405h);
                    intent.putExtra("key_type", "1");
                    intent.putExtra("key_save_notify_info", new java.lang.String(((r45.lw) fVar2.f152151d).f461406i.g()));
                    activityC13148x64d0f1c5.setResult(-1, intent);
                    activityC13148x64d0f1c5.mo48674x36654fab();
                    activityC13148x64d0f1c5.finish();
                }
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class n0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.i f177853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 f177854b;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82, xw1.i iVar) {
        this.f177854b = activityC13137x38066d82;
        this.f177853a = iVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        xw1.i iVar = this.f177853a;
        java.lang.String str2 = iVar.f539211n.f464977f;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82.f177801x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82 = this.f177854b;
        activityC13137x38066d82.getClass();
        activityC13137x38066d82.f177813r = iVar.f539211n.f464981m;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_desc", iVar.f539211n.f464981m);
        intent.putExtra("key_photo_url", iVar.f539211n.f464977f);
        intent.putExtra("key_photo_aeskey", iVar.f539211n.f464978g);
        intent.putExtra("key_photo_width", iVar.f539211n.f464982n);
        intent.putExtra("key_icon_width", iVar.f539211n.f464979h);
        intent.putExtra("key_return_from_first", activityC13137x38066d82.f177815t);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f539211n.f464983o)) {
            intent.putExtra("key_photo_url_v2", iVar.f539211n.f464983o);
        }
        activityC13137x38066d82.setResult(-1, intent);
        activityC13137x38066d82.finish();
    }
}

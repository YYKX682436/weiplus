package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        super(1);
        this.f101906d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101906d;
        com.tencent.mm.plugin.finder.activity.uic.c1.P6(c1Var);
        long j17 = ((r45.lq2) it.f70618d).getLong(1);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ACTIVITY_READ_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        java.lang.String obj2 = mMEditText.getText().toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c1Var.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        java.lang.String obj3 = mMEditText2.getText().toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_id", j17);
        intent.putExtra("key_activity_name", obj2);
        intent.putExtra("key_activity_desc", obj3);
        intent.putExtra("key_nick_name", c1Var.A);
        intent.putExtra("key_activity_local_cover_url", c1Var.H);
        intent.putExtra("key_cover_url", c1Var.G);
        intent.putExtra("key_activity_type", 101);
        intent.putExtra("key_activity_end_time", c1Var.f101858w);
        com.tencent.mars.xlog.Log.i("FinderActivityPostUI", "eventTopicId:" + j17 + "  name:" + obj2 + "  desc:" + obj3);
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        activity.setResult(-1, intent);
        if (!activity.isFinishing()) {
            activity.finish();
        }
        return jz5.f0.f302826a;
    }
}

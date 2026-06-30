package qz0;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 f449358d;

    public h(com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 activityC11028x640d33e0) {
        this.f449358d = activityC11028x640d33e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_template/test/TemplateTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        new android.content.Intent().putExtra("key_can_select_video_and_pic", false);
        com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 activityC11028x640d33e0 = this.f449358d;
        j45.l.n(activityC11028x640d33e0, "gallery", ".ui.GalleryEntryUI", activityC11028x640d33e0.getIntent(), 1);
        yj0.a.h(this, "com/tencent/mm/mj_template/test/TemplateTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

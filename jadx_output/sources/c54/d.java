package c54;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c54.g f38676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f38677e;

    public d(c54.g gVar, android.view.View view) {
        this.f38676d = gVar;
        this.f38677e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1$onCallback$1$1");
        c54.g.a(this.f38676d, this.f38677e, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1$onCallback$1$1");
    }
}

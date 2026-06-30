package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/bullet/PlayTogetherBulletView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView */
/* loaded from: classes2.dex */
public final class C14563x2cd56f15 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public r45.le1 f203643d;

    /* renamed from: e, reason: collision with root package name */
    public zm0.i f203644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14563x2cd56f15(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ym5.a1.i(this, new vq2.c(this));
        android.content.Context context2 = getContext();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2 : null;
        if (activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView.2
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15.this.a("onDestroy");
            }
        });
    }

    public final void a(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayTogetherBulletView", "onDetach: source=".concat(source));
        zm0.i iVar = this.f203644e;
        if (iVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LinearBulletManager", "release: ");
            iVar.d();
            iVar.f555654b.removeAllViews();
        }
        this.f203644e = null;
        this.f203643d = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14563x2cd56f15(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ym5.a1.i(this, new vq2.c(this));
        android.content.Context context2 = getContext();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2 : null;
        if (activityC0065xcd7aa112 == null || (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView.2
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15.this.a("onDestroy");
            }
        });
    }
}

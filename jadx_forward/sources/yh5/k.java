package yh5;

/* loaded from: classes3.dex */
public final class k extends lf3.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // lf3.c0, kg3.f
    /* renamed from: onPageSelected */
    public void mo143395x510f45c9(int i17) {
        super.mo143395x510f45c9(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.PreviewComponent", "CleanPreviewComponent.onPageSelected position=" + i17);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        yh5.e eVar = (yh5.e) pf5.z.f435481a.a(activity).a(yh5.e.class);
        if (eVar != null) {
            eVar.Y6(i17);
        }
    }

    @Override // lf3.c0, lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        yh5.g gVar = (yh5.g) pf5.z.f435481a.a(activity).a(yh5.g.class);
        int i17 = gVar != null ? gVar.f543968g : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.PreviewComponent", "CleanPreviewComponent.onViewCreated position=" + i17);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        yh5.e eVar = (yh5.e) pf5.z.f435481a.a(activity2).a(yh5.e.class);
        if (eVar != null) {
            eVar.Y6(i17);
        }
    }
}

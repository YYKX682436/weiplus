package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialTableLayout;", "Landroid/widget/TableLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout */
/* loaded from: classes2.dex */
public final class C16949x6f38aba5 extends android.widget.TableLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f236538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16949x6f38aba5(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        boolean z18;
        if (this.f236538d || i18 >= 0) {
            i28 = i18;
            i29 = i27;
            z18 = false;
        } else {
            int i37 = i27 - i18;
            z18 = true;
            i29 = i37;
            i28 = 0;
        }
        this.f236538d = false;
        if (z18) {
            layout(i17, i28, i19, i29);
        } else {
            super.onLayout(z17, i17, i28, i19, i29);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16949x6f38aba5(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}

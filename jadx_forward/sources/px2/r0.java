package px2;

/* loaded from: classes2.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c f440452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c) {
        super(0);
        this.f440452d = c15413x7c45044c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalVideoPreviewLayout", "onMoveInLockArea");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c c15413x7c45044c = this.f440452d;
        c15413x7c45044c.f214119y0 = true;
        c15413x7c45044c.x();
        ow2.h hVar = c15413x7c45044c.W;
        if (hVar != null) {
            hVar.b(c15413x7c45044c.f214117x0);
        }
        float f17 = c15413x7c45044c.f214117x0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalVideoPreviewLayout", "changeLockAreaState lock=true speed=" + f17);
        android.view.View view = c15413x7c45044c.U;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "changeLockAreaState", "(FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "changeLockAreaState", "(FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = c15413x7c45044c.V;
        if (textView != null) {
            if (f17 == 1.0f) {
                string = c15413x7c45044c.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5k);
            } else {
                android.content.Context context = c15413x7c45044c.getContext();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i17 = (int) f17;
                objArr[0] = f17 == ((float) i17) ? java.lang.String.valueOf(i17) : java.lang.String.valueOf(f17);
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5l, objArr);
            }
            textView.setText(string);
        }
        hc2.f1.x(c15413x7c45044c);
        return jz5.f0.f384359a;
    }
}

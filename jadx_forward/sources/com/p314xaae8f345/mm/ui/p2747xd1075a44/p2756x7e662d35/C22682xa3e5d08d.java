package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0013R*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/VideoTimeView;", "Landroid/widget/TextView;", "Lml5/e0;", "", "value", "d", "I", "getDuration", "()I", "setDuration", "(I)V", "duration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.cropview.VideoTimeView */
/* loaded from: classes2.dex */
public final class C22682xa3e5d08d extends android.widget.TextView implements ml5.e0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int duration;

    public C22682xa3e5d08d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        setTextSize(0, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562895rg);
        int dimension = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        setPadding(dimension, dimension2, dimension, dimension2);
    }

    public final java.lang.String a(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: setDuration */
    public final void m81948xffd6ec16(int i17) {
        this.duration = i17;
        setText(a(i17 / 60) + ':' + a(i17 % 60));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setDuration] value=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeView", sb6.toString());
    }

    public C22682xa3e5d08d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        setTextSize(0, getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
        setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562895rg);
        int dimension = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        setPadding(dimension, dimension2, dimension, dimension2);
    }
}

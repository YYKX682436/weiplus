package oa1;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f425341a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageButton f425342b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageButton f425343c;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public int a() {
        return com.p314xaae8f345.mm.R.id.hbt;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWidgetCreated, "onWidgetCreated");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.rightMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        layoutParams.leftMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        return layoutParams;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f81556do, (android.view.ViewGroup) null);
        this.f425342b = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.ham);
        this.f425343c = (android.widget.ImageButton) inflate.findViewById(com.p314xaae8f345.mm.R.id.hqb);
        this.f425341a = inflate;
        return inflate;
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        android.widget.ImageButton imageButton = this.f425342b;
        if (imageButton != null) {
            imageButton.setOnClickListener(new oa1.b(runtime));
        }
        android.widget.ImageButton imageButton2 = this.f425343c;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new oa1.c(runtime));
        }
    }
}

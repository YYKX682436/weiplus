package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.AlbumChooserView */
/* loaded from: classes10.dex */
public class C22596xee3b48b1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f292773d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f292774e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f292775f;

    /* renamed from: g, reason: collision with root package name */
    public al5.d f292776g;

    public C22596xee3b48b1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292775f = false;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569525di, (android.view.ViewGroup) this, true);
        this.f292773d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564354ou);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564353ot);
        this.f292774e = c22699x3dcdb352;
        c22699x3dcdb352.setRotation(90.0f);
        setOnClickListener(new al5.a(this));
    }

    /* renamed from: setOnAlbumChooserViewClick */
    public void m81248xaca64416(al5.d dVar) {
        this.f292776g = dVar;
    }

    public C22596xee3b48b1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292775f = false;
        a(context);
    }
}

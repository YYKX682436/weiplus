package com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView */
/* loaded from: classes5.dex */
public class C16783xd8f83d56 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd implements mp3.l {

    /* renamed from: f, reason: collision with root package name */
    public mp3.k f234425f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f234426g;

    /* renamed from: h, reason: collision with root package name */
    public pp3.b f234427h;

    public C16783xd8f83d56(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // mp3.l
    /* renamed from: getDoubleClickListener */
    public mp3.k mo67507xa8abf2d5() {
        return this.f234425f;
    }

    @Override // mp3.l
    /* renamed from: getOnClickListener */
    public android.view.View.OnClickListener mo67508x69f39c87() {
        return this.f234426g;
    }

    @Override // mp3.l
    /* renamed from: getTagScene */
    public int mo67509x4da25688() {
        if (getTag(com.p314xaae8f345.mm.R.id.f567803kq0) == null) {
            return 0;
        }
        return ((java.lang.Integer) getTag(com.p314xaae8f345.mm.R.id.f567803kq0)).intValue();
    }

    @Override // mp3.l
    /* renamed from: getTagTalker */
    public java.lang.String mo67510x684447dd() {
        return getTag(com.p314xaae8f345.mm.R.id.f567804kq1) == null ? "" : (java.lang.String) getTag(com.p314xaae8f345.mm.R.id.f567804kq1);
    }

    @Override // mp3.l
    /* renamed from: getTagUsername */
    public java.lang.String mo67511x7cd7b95a() {
        return (java.lang.String) getTag(com.p314xaae8f345.mm.R.id.f567805kq2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((pp3.j) this.f234427h).a();
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f234426g = onClickListener;
        super.setOnClickListener(((pp3.j) this.f234427h).f439018d);
    }

    /* renamed from: setOnDoubleClickListener */
    public void m67512x74caf26a(mp3.k kVar) {
        this.f234425f = kVar;
    }

    /* renamed from: setTagScene */
    public void m67513x485ab794(int i17) {
        setTag(com.p314xaae8f345.mm.R.id.f567803kq0, java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setTagTalker */
    public void m67514xc4980851(java.lang.String str) {
        setTag(com.p314xaae8f345.mm.R.id.f567804kq1, str);
    }

    /* renamed from: setTagUsername */
    public void mo67515x133d2cce(java.lang.String str) {
        java.lang.String mo67511x7cd7b95a = mo67511x7cd7b95a();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (mo67511x7cd7b95a == null) {
            mo67511x7cd7b95a = "";
        }
        if (!mo67511x7cd7b95a.equals(str)) {
            ((pp3.j) this.f234427h).a();
        }
        setTag(com.p314xaae8f345.mm.R.id.f567805kq2, str);
    }

    public C16783xd8f83d56(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        ((mb0.e) ((nb0.e) i95.n0.c(nb0.e.class))).getClass();
        pp3.j jVar = new pp3.j();
        this.f234427h = jVar;
        jVar.f439015a = this;
    }
}

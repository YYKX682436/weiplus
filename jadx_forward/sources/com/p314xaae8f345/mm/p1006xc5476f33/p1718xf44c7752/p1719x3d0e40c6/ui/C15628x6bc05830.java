package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/gallery/livephoto/ui/GalleryLivePhotoTagLayout;", "Landroid/widget/LinearLayout;", "Lq23/g;", "callback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout */
/* loaded from: classes10.dex */
public final class C15628x6bc05830 extends android.widget.LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f219939n = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f219940d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f219941e;

    /* renamed from: f, reason: collision with root package name */
    public q23.f f219942f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 f219943g;

    /* renamed from: h, reason: collision with root package name */
    public long f219944h;

    /* renamed from: i, reason: collision with root package name */
    public int f219945i;

    /* renamed from: m, reason: collision with root package name */
    public q23.g f219946m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15628x6bc05830(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f219945i = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o23.o.f423986a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f219940d = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 mediaItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "init " + hashCode() + ", mediaId: " + mediaItem.f219967i);
        if (!this.f219941e) {
            int i17 = this.f219940d;
            if (i17 == 0) {
                this.f219942f = new q23.a(this);
            } else if (i17 == 1) {
                q23.j jVar = new q23.j(this);
                this.f219942f = jVar;
                jVar.b(new q23.b(this));
            } else if (i17 == 2) {
                this.f219942f = new q23.h(this);
            }
            this.f219941e = true;
        }
        this.f219943g = mediaItem;
        this.f219944h = mediaItem.f219967i;
    }

    public final void b(int i17) {
        java.lang.String str;
        if (this.f219944h == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "showLayoutInState >> " + hashCode() + " mediaId: " + this.f219944h + ", state: " + i17 + " showCurrentState: " + this.f219945i);
        if (this.f219945i == i17) {
            return;
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = this.f219943g;
            int i18 = c15632xfc4fd0d0 != null ? c15632xfc4fd0d0.I : 1;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a();
            am.zi ziVar = c5683x770cde8a.f136009g;
            ziVar.f90100b = true;
            if (i18 != 1) {
                ziVar.f90100b = false;
                i17 = 2;
            } else {
                i17 = 1;
            }
            ziVar.f90099a = this.f219944h;
            ziVar.f90101c = this.f219940d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d02 = this.f219943g;
            if (c15632xfc4fd0d02 == null || (str = c15632xfc4fd0d02.f219963e) == null) {
                str = "";
            }
            ziVar.f90102d = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "pickDefaultState >> " + hashCode() + " mediaId: " + this.f219944h + ", isUseLivePhoto: " + ziVar.f90100b + " showCurrentState: " + this.f219945i);
            c5683x770cde8a.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "pickDefaultState >> " + hashCode() + " mediaId: " + this.f219944h + ", state: " + i17 + " showCurrentState: " + this.f219945i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d03 = this.f219943g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d03);
        c15632xfc4fd0d03.A = i17;
        this.f219945i = i17;
        setVisibility(0);
        q23.f fVar = this.f219942f;
        if (fVar != null) {
            fVar.a(i17);
        }
    }

    public final void c(boolean z17) {
        if (this.f219944h == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLayoutSelectState >> ");
        sb6.append(hashCode());
        sb6.append(" mediaId: ");
        sb6.append(this.f219944h);
        sb6.append(", isSelect: ");
        sb6.append(z17);
        sb6.append(" currentLivePhotoState: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = this.f219943g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d0);
        sb6.append(c15632xfc4fd0d0.A);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d02 = this.f219943g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d02);
        if (c15632xfc4fd0d02.H != 1) {
            b(3);
        }
    }

    /* renamed from: setLivePhotoTagClickCallback */
    public final void m63655xdc00daf7(q23.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f219946m = callback;
    }
}

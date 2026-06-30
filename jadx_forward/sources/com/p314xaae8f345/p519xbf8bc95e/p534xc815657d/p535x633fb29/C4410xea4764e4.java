package com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29;

/* renamed from: com.tencent.mapsdk.raster.model.MarkerOptions */
/* loaded from: classes13.dex */
public final class C4410xea4764e4 {

    /* renamed from: anchorOffsetX */
    private int f17448x13217db0;

    /* renamed from: anchorOffsetY */
    private int f17449x13217db1;

    /* renamed from: bitmapDescriptor */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e f17452x73b331fe;

    /* renamed from: contentDescription */
    private java.lang.String f17454xb416a1c3;

    /* renamed from: hidingAnination */
    private android.view.animation.Animation f17455x77c9a164;

    /* renamed from: id, reason: collision with root package name */
    protected java.lang.String f134024id;

    /* renamed from: infoWindowHideAnimation */
    private android.view.animation.Animation f17457x6ffffac4;

    /* renamed from: infoWindowShowAnimation */
    private android.view.animation.Animation f17458x3aed3f69;

    /* renamed from: latLng */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f17464xbdd83106;

    /* renamed from: mCollisions */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b[] f17465x7c1797ce;

    /* renamed from: mIndoorInfo */
    private com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1 f17466xb5585ee;

    /* renamed from: markerView */
    private android.view.View f17467x427c95ff;

    /* renamed from: showingAnination */
    private android.view.animation.Animation f17469xcb3c81de;

    /* renamed from: snippet */
    private java.lang.String f17470x851df11d;
    private java.lang.Object tag;

    /* renamed from: title */
    private java.lang.String f17471x6942258;

    /* renamed from: zIndex */
    private int f17472xd4677478;

    /* renamed from: isDraggable */
    private boolean f17460x34173f83 = false;

    /* renamed from: isVisible */
    private boolean f17463xf94337e8 = true;

    /* renamed from: isGps */
    private boolean f17462x5fd0320 = false;

    /* renamed from: anchorU */
    private float f17450xcc959440 = 0.5f;

    /* renamed from: anchorV */
    private float f17451xcc959441 = 1.0f;

    /* renamed from: alpha */
    private float f17447x589b15e = 1.0f;

    /* renamed from: rotation */
    private float f17468xfd990f7e = 0.0f;

    /* renamed from: isFlat */
    private boolean f17461xb9a2dbc3 = false;

    /* renamed from: isClockwise */
    private boolean f17459xe9217a8 = true;

    /* renamed from: iLevel */
    private int f17456xb78b849b = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828;

    /* renamed from: collisionRelation */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 f17453x1078534e = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.ALONE;

    /* renamed from: alpha */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37267x589b15e(float f17) {
        this.f17447x589b15e = f17;
        return this;
    }

    /* renamed from: anchor */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37268xabc2c2b5(float f17, float f18) {
        this.f17450xcc959440 = f17;
        this.f17451xcc959441 = f18;
        return this;
    }

    /* renamed from: clockwise */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37269xc854d5b2(boolean z17) {
        this.f17459xe9217a8 = z17;
        return this;
    }

    /* renamed from: contentDescription */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37270xb416a1c3(java.lang.String str) {
        this.f17454xb416a1c3 = str;
        return this;
    }

    /* renamed from: draggable */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37271xedd9fd8d(boolean z17) {
        this.f17460x34173f83 = z17;
        return this;
    }

    /* renamed from: flat */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37272x2fff79(boolean z17) {
        this.f17461xb9a2dbc3 = z17;
        return this;
    }

    /* renamed from: getAlpha */
    public float m37273x742757a8() {
        return this.f17447x589b15e;
    }

    /* renamed from: getAnchorU */
    public float m37274xa62d00a() {
        return this.f17450xcc959440;
    }

    /* renamed from: getAnchorV */
    public float m37275xa62d00b() {
        return this.f17451xcc959441;
    }

    /* renamed from: getCollisionRelation */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 m37276x63acda98() {
        return this.f17453x1078534e;
    }

    /* renamed from: getCollisions */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b[] m37277x8e265777() {
        return this.f17465x7c1797ce;
    }

    /* renamed from: getContentDescription */
    public java.lang.String m37278xc77303b9() {
        return this.f17454xb416a1c3;
    }

    /* renamed from: getHidingAnination */
    public android.view.animation.Animation m37279x5c2b732e() {
        return this.f17455x77c9a164;
    }

    /* renamed from: getIcon */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e m37280xfb80a4ef() {
        return this.f17452x73b331fe;
    }

    /* renamed from: getIndoorInfo */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1 m37281x1d644597() {
        return this.f17466xb5585ee;
    }

    /* renamed from: getInfoWindowHideAnimation */
    public android.view.animation.Animation m37282x4000628e() {
        return this.f17457x6ffffac4;
    }

    /* renamed from: getInfoWindowOffsetX */
    public int m37283x49c37951() {
        return this.f17448x13217db0;
    }

    /* renamed from: getInfoWindowShowAnimation */
    public android.view.animation.Animation m37284xaeda733() {
        return this.f17458x3aed3f69;
    }

    /* renamed from: getInfowindowOffsetY */
    public int m37285x1a244972() {
        return this.f17449x13217db1;
    }

    /* renamed from: getLevel */
    public int m37286x74bf41ce() {
        return this.f17456xb78b849b;
    }

    /* renamed from: getMarkerView */
    public android.view.View m37287x30bd4df5() {
        return this.f17467x427c95ff;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m37288xa86cd69f() {
        return this.f17464xbdd83106;
    }

    /* renamed from: getRotation */
    public float m37289x79734cf4() {
        return this.f17468xfd990f7e;
    }

    /* renamed from: getShowingAnination */
    public android.view.animation.Animation m37290x7314e954() {
        return this.f17469xcb3c81de;
    }

    /* renamed from: getSnippet */
    public java.lang.String m37291xc2eb2ce7() {
        return this.f17470x851df11d;
    }

    /* renamed from: getTag */
    public java.lang.Object m37292xb5887064() {
        return this.tag;
    }

    /* renamed from: getTitle */
    public java.lang.String m37293x7531c8a2() {
        return this.f17471x6942258;
    }

    /* renamed from: getZIndex */
    public int m37294x397e976e() {
        return this.f17472xd4677478;
    }

    /* renamed from: icon */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37295x313c79(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e c4392x4177761e) {
        this.f17452x73b331fe = c4392x4177761e;
        return this;
    }

    /* renamed from: indoorInfo */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37296x2f238da1(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4402xa5f569c1 c4402xa5f569c1) {
        this.f17466xb5585ee = c4402xa5f569c1;
        return this;
    }

    /* renamed from: infoWindowHideAnimation */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37297x6ffffac4(android.view.animation.Animation animation) {
        this.f17457x6ffffac4 = animation;
        return this;
    }

    /* renamed from: infoWindowOffset */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37298x4a049c71(int i17, int i18) {
        this.f17448x13217db0 = i17;
        this.f17449x13217db1 = i18;
        return this;
    }

    /* renamed from: infoWindowShowAnimation */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37299x3aed3f69(android.view.animation.Animation animation) {
        this.f17458x3aed3f69 = animation;
        return this;
    }

    /* renamed from: isClockwise */
    public boolean m37300xe9217a8() {
        return this.f17459xe9217a8;
    }

    /* renamed from: isDraggable */
    public boolean m37301x34173f83() {
        return this.f17460x34173f83;
    }

    /* renamed from: isFlat */
    public boolean m37302xb9a2dbc3() {
        return this.f17461xb9a2dbc3;
    }

    /* renamed from: isGps */
    public boolean m37303x5fd0320() {
        return this.f17462x5fd0320;
    }

    /* renamed from: isVisible */
    public boolean m37304xf94337e8() {
        return this.f17463xf94337e8;
    }

    /* renamed from: level */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37305x6219b84(int i17) {
        if (i17 >= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17475xe09ee40a && i17 <= com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4411x19c3ed34.f17474x283bb828) {
            this.f17456xb78b849b = i17;
        }
        return this;
    }

    /* renamed from: markerView */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37306x427c95ff(android.view.View view) {
        this.f17467x427c95ff = view;
        return this;
    }

    /* renamed from: position */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37307x2c929929(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
        this.f17464xbdd83106 = c4406x873d1d26;
        return this;
    }

    /* renamed from: rotation */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37308xfd990f7e(float f17) {
        this.f17468xfd990f7e = f17;
        return this;
    }

    /* renamed from: setCollisions */
    public void m37309xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b... enumC26060x2581df2bArr) {
        this.f17465x7c1797ce = enumC26060x2581df2bArr;
    }

    /* renamed from: setHidingAnination */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37310x93020ca2(android.view.animation.Animation animation) {
        this.f17455x77c9a164 = animation;
        return this;
    }

    /* renamed from: setMarkerCollisionRelation */
    public void m37311x8b280772(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 enumC26061x5ec49214) {
        this.f17453x1078534e = enumC26061x5ec49214;
    }

    /* renamed from: setShowingAnination */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37312x17117e60(android.view.animation.Animation animation) {
        this.f17469xcb3c81de = animation;
        return this;
    }

    /* renamed from: snippet */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37313x851df11d(java.lang.String str) {
        this.f17470x851df11d = str;
        return this;
    }

    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 tag(java.lang.Object obj) {
        this.tag = obj;
        return this;
    }

    /* renamed from: title */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37314x6942258(java.lang.String str) {
        this.f17471x6942258 = str;
        return this;
    }

    /* renamed from: visible */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37315x1bd1f072(boolean z17) {
        this.f17463xf94337e8 = z17;
        return this;
    }

    /* renamed from: zIndex */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37316xd4677478(int i17) {
        this.f17472xd4677478 = i17;
        return this;
    }
}

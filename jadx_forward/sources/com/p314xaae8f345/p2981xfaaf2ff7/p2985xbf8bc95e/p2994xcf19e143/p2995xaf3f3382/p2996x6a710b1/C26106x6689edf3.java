package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager */
/* loaded from: classes13.dex */
public class C26106x6689edf3 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f296906a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map<java.lang.String, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection> f296907b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection> f296908c = new java.util.HashMap();

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager$Collection */
    /* loaded from: classes13.dex */
    public class Collection {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> f296909a = new java.util.HashSet();

        /* renamed from: b, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener f296910b;

        /* renamed from: c, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener f296911c;

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter f296912d;

        public Collection() {
        }

        /* renamed from: getMarkers */
        public java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> m100093x6fd32f43() {
            return java.util.Collections.unmodifiableCollection(this.f296909a);
        }

        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4) {
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a mo98940xf4c43c3b = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.this.f296906a.mo98940xf4c43c3b(c4410xea4764e4);
            this.f296909a.add(mo98940xf4c43c3b);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.this.f296908c.put(mo98940xf4c43c3b, this);
            return mo98940xf4c43c3b;
        }

        public boolean a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            if (!this.f296909a.remove(interfaceC4409x88f1805a)) {
                return false;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.this.f296908c.remove(interfaceC4409x88f1805a);
            interfaceC4409x88f1805a.mo37126xc84af884();
            return true;
        }

        public void a() {
            for (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a : this.f296909a) {
                interfaceC4409x88f1805a.mo37126xc84af884();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.this.f296908c.remove(interfaceC4409x88f1805a);
            }
            this.f296909a.clear();
        }

        public void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.f296910b = onInfoWindowClickListener;
        }

        public void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener) {
            this.f296911c = onMarkerClickListener;
        }

        public void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter infoWindowAdapter) {
            this.f296912d = infoWindowAdapter;
        }
    }

    public C26106x6689edf3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7) {
        this.f296906a = interfaceC25945x718093f7;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
    /* renamed from: getInfoWindow */
    public android.view.View mo99027xc3c42a34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection collection = this.f296908c.get(interfaceC4409x88f1805a);
        if (collection == null || collection.f296912d == null) {
            return null;
        }
        return collection.f296912d.mo99027xc3c42a34(interfaceC4409x88f1805a);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener
    /* renamed from: onInfoWindowClick */
    public void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection collection = this.f296908c.get(interfaceC4409x88f1805a);
        if (collection == null || collection.f296910b == null) {
            return;
        }
        collection.f296910b.mo66012xc56a6a0b(interfaceC4409x88f1805a);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
    /* renamed from: onInfoWindowDettached */
    public void mo99028xf6653887(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.view.View view) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
    /* renamed from: onMarkerClick */
    public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection collection = this.f296908c.get(interfaceC4409x88f1805a);
        if (collection == null || collection.f296911c == null) {
            return false;
        }
        return collection.f296911c.mo14570x289a5e0f(interfaceC4409x88f1805a);
    }

    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection a() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection();
    }

    public boolean a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection collection = this.f296908c.get(interfaceC4409x88f1805a);
        return collection != null && collection.a(interfaceC4409x88f1805a);
    }
}

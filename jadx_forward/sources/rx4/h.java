package rx4;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f482692b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482693c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f482694d;

    public h(org.json.JSONObject raw, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482691a = raw;
        this.f482692b = z17;
        this.f482693c = "";
        this.f482694d = new java.util.ArrayList();
        java.lang.String optString = raw.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482693c = optString;
    }

    public final void a(java.util.List liveItems) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveItems, "liveItems");
        if (liveItems.isEmpty() || !this.f482692b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", "FTSHistoryBlock updateByLive, liveItems: " + liveItems.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List V0 = kz5.n0.V0(this.f482694d);
        java.util.Iterator it = liveItems.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            rx4.j jVar = (rx4.j) it.next();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            java.util.Iterator it6 = arrayList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((rx4.i) it6.next()).f482719b, jVar.f482734c)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 != -1) {
                rx4.i iVar = (rx4.i) arrayList2.remove(i17);
                java.lang.String str = iVar.f482723f;
                iVar.f482724g = jVar.f482738g;
                iVar.f482726i = jVar.f482737f;
                java.lang.String str2 = jVar.f482736e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                iVar.f482725h = str2;
                java.lang.String str3 = jVar.f482733b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                iVar.f482723f = str3;
                java.lang.String str4 = jVar.f482735d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                iVar.f482720c = str4;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] updateByLive override, hotword=");
                java.lang.String str5 = iVar.f482719b;
                sb6.append(str5);
                sb6.append(", oldSearchId='");
                sb6.append(str);
                sb6.append("', newSearchId='");
                sb6.append(str3);
                sb6.append('\'');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
                arrayList.add(iVar);
                if (iVar.f482724g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", "add LiveItem, matchedItem, hotword: " + str5 + ", isLive: " + iVar.f482724g + ", tagType: " + iVar.f482726i + ", tagTitle: " + iVar.f482725h + "searchId: " + iVar.f482723f);
                }
            }
        }
        arrayList.addAll(V0);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[hitest] updateByLive done, items.size=");
        sb7.append(arrayList.size());
        sb7.append(", withSearchId=");
        if (!arrayList.isEmpty()) {
            java.util.Iterator it7 = arrayList.iterator();
            int i18 = 0;
            while (it7.hasNext()) {
                if ((((rx4.i) it7.next()).f482723f.length() > 0) && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
            i17 = i18;
        }
        sb7.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", sb7.toString());
        this.f482694d.clear();
        this.f482694d.addAll(arrayList);
    }

    /* renamed from: equals */
    public boolean m163404xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.h)) {
            return false;
        }
        rx4.h hVar = (rx4.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482691a, hVar.f482691a) && this.f482692b == hVar.f482692b;
    }

    /* renamed from: hashCode */
    public int m163405x8cdac1b() {
        return (this.f482691a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f482692b);
    }

    /* renamed from: toString */
    public java.lang.String m163406x9616526c() {
        return "FTSHistoryBlock(raw=" + this.f482691a + ", isNewStyle=" + this.f482692b + ')';
    }
}

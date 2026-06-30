package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
/* loaded from: classes15.dex */
class C0040x2b820f92 extends p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c {
    @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
    public void a(int i17, android.os.Bundle bundle) {
        if (bundle != null) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0.a(bundle);
            try {
                bundle.isEmpty();
            } catch (android.os.BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i17 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
        for (android.os.Parcelable parcelable : parcelableArray) {
            arrayList.add((p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939) parcelable);
        }
        throw null;
    }
}

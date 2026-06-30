package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
/* loaded from: classes15.dex */
class C0038xd9a7bec0 extends p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c {
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
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        android.os.Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0039xb81f0939)) {
            throw null;
        }
        throw null;
    }
}

package k25;

/* loaded from: classes13.dex */
public class c implements k25.a {
    @Override // k25.a
    public boolean d() {
        if (!com.p314xaae8f345.p3210x3857dc.C27818xf002da6f.f301736e.get()) {
            by5.c4.f("XWebCoreContentProvider", "isBusy = true, xweb not init yet");
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.p3210x3857dc.C27818xf002da6f.f301737f.get();
        if (currentTimeMillis < 0 || currentTimeMillis > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            by5.c4.f("XWebCoreContentProvider", "isBusy = false");
            return false;
        }
        by5.c4.f("XWebCoreContentProvider", "isBusy = true, is operating now");
        return true;
    }
}

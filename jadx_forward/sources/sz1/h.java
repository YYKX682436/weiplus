package sz1;

/* loaded from: classes9.dex */
public class h implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {
    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.util.Iterator it = ((java.util.ArrayList) sz1.i.f495475c).iterator();
        boolean z17 = false;
        while (it.hasNext() && !(z17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.k3) it.next()).handleMessage(message))) {
        }
        return z17;
    }
}

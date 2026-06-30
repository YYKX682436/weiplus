package xx1;

/* loaded from: classes7.dex */
public class a implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f539491d;

    /* renamed from: e, reason: collision with root package name */
    public final int f539492e;

    public a(xx1.c cVar, android.os.Handler handler, int i17) {
        this.f539491d = handler;
        this.f539492e = i17;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        android.os.Handler handler = this.f539491d;
        if (this.f539492e != i17) {
            handler.handleMessage(message);
            return true;
        }
        try {
            handler.handleMessage(message);
            return true;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetTextBeforeCursorFix", "catch IndexOutOfBoundsException");
            return true;
        }
    }
}

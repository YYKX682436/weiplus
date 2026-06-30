package wb;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public wb.d f525878a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f525879b = new wb.j(this);

    public final void a(int i17) {
        android.os.Handler handler = this.f525879b;
        android.os.Message obtainMessage = handler.obtainMessage(100);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i17);
        obtainMessage.setData(bundle);
        handler.sendMessage(obtainMessage);
    }
}

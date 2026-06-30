package q01;

/* loaded from: classes12.dex */
public final class i extends e75.i {
    public void a(int i17, p012xc85e97e9.p093xedfae76a.y lifecycleOwner, java.lang.String threadTag, q01.e observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadTag, "threadTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        synchronized (this.f331513a) {
            java.util.HashMap hashMap = this.f331513a;
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new e75.h(this, valueOf);
                hashMap.put(valueOf, obj);
            }
            ((e75.h) obj).m127127x9d92d11c(lifecycleOwner, threadTag, observer);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.k2.b(observer);
    }
}

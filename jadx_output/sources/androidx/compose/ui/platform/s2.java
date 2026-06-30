package androidx.compose.ui.platform;

/* loaded from: classes13.dex */
public final class s2 implements o4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.s f10742a;

    public s2(w0.s sVar) {
        this.f10742a = sVar;
    }

    @Override // o4.d
    public final android.os.Bundle a() {
        java.util.Map a17 = this.f10742a.a();
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : a17.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
        }
        return bundle;
    }
}

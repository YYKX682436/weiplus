package dc2;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13723x3e57ef0a f310226d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13723x3e57ef0a c13723x3e57ef0a) {
        this.f310226d = c13723x3e57ef0a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a.C13723x3e57ef0a c13723x3e57ef0a = this.f310226d;
        android.content.Context context = c13723x3e57ef0a.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setResult(10013);
        }
        android.content.Context context2 = c13723x3e57ef0a.getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity2 != null) {
            activity2.finish();
        }
    }
}

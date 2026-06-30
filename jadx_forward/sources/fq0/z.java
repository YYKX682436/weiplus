package fq0;

@j95.b
/* loaded from: classes7.dex */
public final class z extends i95.w implements gq0.r {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f347027d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f347028e = new java.util.HashMap();

    public fq0.x Ai(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f347028e.get(id6);
        if (weakReference != null) {
            return (fq0.x) weakReference.get();
        }
        return null;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        ((ku5.t0) ku5.t0.f394148d).q(new fq0.y(this));
    }

    public fq0.x wi(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        java.util.HashMap hashMap = this.f347028e;
        java.lang.String str = frameSet.f347011b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new java.lang.ref.WeakReference(frameSet));
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(str);
        fq0.x xVar = weakReference != null ? (fq0.x) weakReference.get() : null;
        return xVar == null ? frameSet : xVar;
    }
}

package d00;

/* loaded from: classes7.dex */
public final class a implements d00.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f306784a;

    public a(java.util.LinkedList featureList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(featureList, "featureList");
        this.f306784a = featureList;
    }

    @Override // d00.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean a(java.util.Map input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        boolean z17 = false;
        if (!input.isEmpty()) {
            java.util.Iterator it = this.f306784a.iterator();
            while (it.hasNext()) {
                bw5.w7 w7Var = (bw5.w7) it.next();
                int i17 = w7Var.f116130d;
                java.lang.String valueOf = java.lang.String.valueOf(w7Var.f116131e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckFeatureVersionTask", "feature list -> " + w7Var);
                if (input.containsKey(java.lang.Integer.valueOf(i17))) {
                    java.lang.Object obj = input.get(java.lang.Integer.valueOf(i17));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    java.lang.String str = (java.lang.String) obj;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckFeatureVersionTask", "hy: got record version " + str + ", minVersion " + valueOf);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(str) < com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(valueOf)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckFeatureVersionTask", "The minimum running version of the mini program is smaller than the required minimum version, force pull");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckFeatureVersionTask", "The local feature does not contain the features required by the server, force pull");
                }
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CheckFeatureVersionTask", "server feature list is null, don't force pull");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

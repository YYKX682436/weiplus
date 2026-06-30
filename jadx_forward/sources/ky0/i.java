package ky0;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ky0.i f395014a = new ky0.i();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f395015b = new java.util.LinkedHashMap();

    public final void a(java.util.List aiPathList, java.util.List sourcePathList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aiPathList, "aiPathList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePathList, "sourcePathList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AITemplateSession", "recordAIAsset2SourcePath: " + aiPathList.size() + ", " + sourcePathList.size());
        for (jz5.l lVar : kz5.n0.a1(aiPathList, sourcePathList)) {
            f395015b.put((java.lang.String) lVar.f384366d, (java.lang.String) lVar.f384367e);
        }
    }
}

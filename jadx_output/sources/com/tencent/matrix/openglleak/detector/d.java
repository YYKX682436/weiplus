package com.tencent.matrix.openglleak.detector;

/* loaded from: classes12.dex */
public class d extends com.tencent.matrix.openglleak.detector.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService f52920e;

    public d(com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService openglIndexDetectorService) {
        this.f52920e = openglIndexDetectorService;
    }

    @Override // com.tencent.matrix.openglleak.detector.c
    public java.util.Map Sh() {
        int i17 = com.tencent.matrix.openglleak.detector.OpenglIndexDetectorService.f52916e;
        this.f52920e.getClass();
        com.tencent.matrix.openglleak.utils.EGLHelper.a();
        com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().init();
        oj.j.c("matrix.OpenglIndexDetectorService", "init env succ", new java.lang.Object[0]);
        int funcIndex = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glGenTextures");
        oj.j.c("matrix.OpenglIndexDetectorService", "glGenTextures index:" + funcIndex, new java.lang.Object[0]);
        int funcIndex2 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glDeleteTextures");
        oj.j.c("matrix.OpenglIndexDetectorService", "glDeleteTextures index:" + funcIndex2, new java.lang.Object[0]);
        int funcIndex3 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glGenBuffers");
        oj.j.c("matrix.OpenglIndexDetectorService", "glGenBuffers index:" + funcIndex3, new java.lang.Object[0]);
        int funcIndex4 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glDeleteBuffers");
        oj.j.c("matrix.OpenglIndexDetectorService", "glDeleteBuffers index:" + funcIndex4, new java.lang.Object[0]);
        int funcIndex5 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glGenFramebuffers");
        oj.j.c("matrix.OpenglIndexDetectorService", "glGenFramebuffers index:" + funcIndex5, new java.lang.Object[0]);
        int funcIndex6 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glDeleteFramebuffers");
        oj.j.c("matrix.OpenglIndexDetectorService", "glDeleteFramebuffers index:" + funcIndex6, new java.lang.Object[0]);
        int funcIndex7 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glGenRenderbuffers");
        oj.j.c("matrix.OpenglIndexDetectorService", "glGenRenderbuffers index:" + funcIndex7, new java.lang.Object[0]);
        int funcIndex8 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glDeleteRenderbuffers");
        oj.j.c("matrix.OpenglIndexDetectorService", "glDeleteRenderbuffers index:" + funcIndex8, new java.lang.Object[0]);
        int funcIndex9 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glTexImage2D");
        oj.j.c("matrix.OpenglIndexDetectorService", "glTexImage2DIndex index:" + funcIndex9, new java.lang.Object[0]);
        int funcIndex10 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glTexImage3D");
        oj.j.c("matrix.OpenglIndexDetectorService", "glTexImage3DIndex index:" + funcIndex10, new java.lang.Object[0]);
        int funcIndex11 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glBindTexture");
        oj.j.c("matrix.OpenglIndexDetectorService", "glBindTextureIndex index:" + funcIndex11, new java.lang.Object[0]);
        int funcIndex12 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glBindBuffer");
        oj.j.c("matrix.OpenglIndexDetectorService", "glBindBufferIndex index:" + funcIndex12, new java.lang.Object[0]);
        int funcIndex13 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glBindFramebuffer");
        oj.j.c("matrix.OpenglIndexDetectorService", "glBindFramebufferIndex index:" + funcIndex13, new java.lang.Object[0]);
        int funcIndex14 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glBindRenderbuffer");
        oj.j.c("matrix.OpenglIndexDetectorService", "glBindRenderbufferIndex index:" + funcIndex14, new java.lang.Object[0]);
        int funcIndex15 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glBufferData");
        oj.j.c("matrix.OpenglIndexDetectorService", "glBufferData index:" + funcIndex15, new java.lang.Object[0]);
        int funcIndex16 = com.tencent.matrix.openglleak.detector.FuncSeeker.getFuncIndex("glRenderbufferStorage");
        oj.j.c("matrix.OpenglIndexDetectorService", "glRenderbufferStorage index:" + funcIndex16, new java.lang.Object[0]);
        if (funcIndex * funcIndex2 * funcIndex3 * funcIndex4 * funcIndex5 * funcIndex6 * funcIndex7 * funcIndex8 * funcIndex9 * funcIndex10 * funcIndex11 * funcIndex12 * funcIndex13 * funcIndex14 * funcIndex16 * funcIndex15 == 0) {
            oj.j.b("matrix.OpenglIndexDetectorService", "seek func index fail!", new java.lang.Object[0]);
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("glGenTextures", java.lang.Integer.valueOf(funcIndex));
        hashMap.put("glDeleteTextures", java.lang.Integer.valueOf(funcIndex2));
        hashMap.put("glGenBuffers", java.lang.Integer.valueOf(funcIndex3));
        hashMap.put("glDeleteBuffers", java.lang.Integer.valueOf(funcIndex4));
        hashMap.put("glGenFramebuffers", java.lang.Integer.valueOf(funcIndex5));
        hashMap.put("glDeleteFramebuffers", java.lang.Integer.valueOf(funcIndex6));
        hashMap.put("glGenRenderbuffers", java.lang.Integer.valueOf(funcIndex7));
        hashMap.put("glDeleteRenderbuffers", java.lang.Integer.valueOf(funcIndex8));
        hashMap.put("glTexImage2D", java.lang.Integer.valueOf(funcIndex9));
        hashMap.put("glTexImage3D", java.lang.Integer.valueOf(funcIndex10));
        hashMap.put("glBindTexture", java.lang.Integer.valueOf(funcIndex11));
        hashMap.put("glBindBuffer", java.lang.Integer.valueOf(funcIndex12));
        hashMap.put("glBindFramebuffer", java.lang.Integer.valueOf(funcIndex13));
        hashMap.put("glBindRenderbuffer", java.lang.Integer.valueOf(funcIndex14));
        hashMap.put("glBufferData", java.lang.Integer.valueOf(funcIndex15));
        hashMap.put("glRenderbufferStorage", java.lang.Integer.valueOf(funcIndex16));
        oj.j.c("matrix.OpenglIndexDetectorService", "seek func index succ!", new java.lang.Object[0]);
        return hashMap;
    }

    @Override // com.tencent.matrix.openglleak.detector.c
    public void Vi() {
        this.f52920e.stopSelf();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/matrix/openglleak/detector/OpenglIndexDetectorService$1", "destory", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }
}

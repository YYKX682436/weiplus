package az0;

/* loaded from: classes5.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f15625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15625d = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.k3(this.f15625d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "new movie session on thread: " + java.lang.Thread.currentThread().getName());
        com.tencent.maas.MJMaasCore q17 = az0.i5.f15557a.q();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.util.List<java.lang.String> i17 = kz5.c0.i("MODEL_FACE_DETECT", "MODEL_FACE_ALIGNMENT", "MODEL_VIDEO_CLIPPING_FEATURE", "MODEL_EXPRESSION_HIGHLIGHT", "MODEL_AUDIO_CNN", "MODEL_VIDEO_CLASSIFICATION", "MODEL_VIDEO_IMG_CLASSIFICATION", "MODEL_VIDEO_IMG_FEAT", "MODEL_VIDEO_HIGHLIGHT", "MODEL_PORTRAITSEGMENT", "MODEL_AUDIO_PREPARE", "MODEL_AUDIO_TASK_AUDIO_FEAT", "MODEL_AUDIO_TASK_FUSION", "MODEL_AUDIO_TASK_IMAGE_FEAT", "MODEL_VIDEO_BGM_FEATURE");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : i17) {
            p05.a3 a3Var = p05.a3.f350439a;
            java.lang.String g17 = a3Var.g(str);
            if (g17 != null) {
                linkedList.add(new com.tencent.maas.model.MJModelInfo(str, g17, a3Var.h(str)));
            }
        }
        return q17.n(handler, linkedList, this.f15625d);
    }
}

package az0;

/* loaded from: classes5.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f97158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97158d = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.k3(this.f97158d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.k3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "new movie session on thread: " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 q17 = az0.i5.f97090a.q();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        java.util.List<java.lang.String> i17 = kz5.c0.i("MODEL_FACE_DETECT", "MODEL_FACE_ALIGNMENT", "MODEL_VIDEO_CLIPPING_FEATURE", "MODEL_EXPRESSION_HIGHLIGHT", "MODEL_AUDIO_CNN", "MODEL_VIDEO_CLASSIFICATION", "MODEL_VIDEO_IMG_CLASSIFICATION", "MODEL_VIDEO_IMG_FEAT", "MODEL_VIDEO_HIGHLIGHT", "MODEL_PORTRAITSEGMENT", "MODEL_AUDIO_PREPARE", "MODEL_AUDIO_TASK_AUDIO_FEAT", "MODEL_AUDIO_TASK_FUSION", "MODEL_AUDIO_TASK_IMAGE_FEAT", "MODEL_VIDEO_BGM_FEATURE");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : i17) {
            p05.a3 a3Var = p05.a3.f431972a;
            java.lang.String g17 = a3Var.g(str);
            if (g17 != null) {
                linkedList.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4115x6599ae5a(str, g17, a3Var.h(str)));
            }
        }
        return q17.n(handler, linkedList, this.f97158d);
    }
}

package ru1;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru1.g f481246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru1.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481246e = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ru1.f fVar = new ru1.f(this.f481246e, interfaceC29045xdcb5ca57);
        fVar.f481245d = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ru1.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f481245d;
        ru1.g gVar = this.f481246e;
        android.media.AudioRecord audioRecord = gVar.f481250d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (audioRecord != null) {
            if (audioRecord.getState() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScreenCastDirectlyEncoder", "createRecorder-audio ar.state != STATE_INITIALIZED");
                return f0Var;
            }
            yj0.a.j(audioRecord, "com/tencent/mm/plugin/cast/encoder/ScreenCastDirectlyEncoder$startRecord$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/media/AudioRecord", "startRecording", "()V");
            pu1.a aVar2 = gVar.f481247a;
            int minBufferSize = android.media.AudioRecord.getMinBufferSize(aVar2.f439949b, aVar2.f439950c == 2 ? 12 : 16, 2);
            byte[] bArr = new byte[minBufferSize];
            while (true) {
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScreenCastDirectlyEncoder", "#createRecorder-audio launch job is end.");
                    break;
                }
                int read = audioRecord.read(bArr, 0, bArr.length);
                if (read < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScreenCastDirectlyEncoder", "#createRecorder-audio something wrong. readSize=" + read);
                    break;
                }
                if (read > 0) {
                    gVar.f481248b.mo146xb9724478(kz5.v.q(bArr, 0, read));
                }
                bArr = new byte[minBufferSize];
            }
        }
        return f0Var;
    }
}

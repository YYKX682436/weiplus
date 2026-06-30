package qn4;

/* loaded from: classes12.dex */
public final class n implements y21.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn4.t f446793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qn4.a f446794b;

    public n(qn4.t tVar, qn4.a aVar) {
        this.f446793a = tVar;
        this.f446794b = aVar;
    }

    @Override // y21.a
    public void a() {
        java.lang.Object m143895xf1229813;
        qn4.t tVar = this.f446793a;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            tVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechController", "onPlayInterrupt: audio focus lost or playback interrupted");
            tVar.f446819h = 4;
            tVar.b();
            boolean z17 = tVar.f446816e;
            qn4.a aVar = this.f446794b;
            if (z17) {
                ((qn4.w) aVar).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onHideLoading");
                qn4.i iVar = qn4.y.f446838d;
                iVar.getClass();
                qn4.v.f446830a.a(new qn4.d(iVar), null);
                tVar.f446816e = false;
            }
            ((qn4.w) aVar).a(1002, "Playback interrupted (audio focus lost)");
            tVar.f446812a = false;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechController", "handlePlayInterrupt error", m143898xd4a2fc34);
        }
    }

    @Override // y21.a
    /* renamed from: onComplete */
    public void mo79464x815f5438() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechController", "onComplete");
        qn4.t tVar = this.f446793a;
        tVar.getClass();
        ((qn4.w) this.f446794b).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onSpeechComplete");
        qn4.y.f446835a.f();
        tVar.f446812a = false;
    }

    @Override // y21.a
    /* renamed from: onProgress */
    public void mo79465x696ee52c(float f17) {
        java.lang.Object m143895xf1229813;
        qn4.t tVar = this.f446793a;
        qn4.a aVar = this.f446794b;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qn4.t.a(tVar, f17, aVar);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechController", "handleProgress error", m143898xd4a2fc34);
        }
    }
}

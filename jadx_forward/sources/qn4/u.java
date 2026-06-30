package qn4;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f446828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f446829e;

    public u(yz5.a aVar, yz5.a aVar2) {
        this.f446828d = aVar;
        this.f446829e = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var = jz5.f0.f384359a;
        qn4.v vVar = qn4.v.f446830a;
        yz5.a aVar = this.f446828d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            aVar.mo152xb9724478();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeech", "ensureMainThread action failed", m143898xd4a2fc34);
            yz5.a aVar2 = this.f446829e;
            if (aVar2 != null) {
                qn4.v vVar2 = qn4.v.f446830a;
                try {
                    aVar2.mo152xb9724478();
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                } catch (java.lang.Throwable th7) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                }
            }
        }
    }
}

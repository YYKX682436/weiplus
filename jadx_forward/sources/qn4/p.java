package qn4;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f446797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn4.a f446798e;

    public p(qn4.t tVar, qn4.a aVar) {
        this.f446797d = tVar;
        this.f446798e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn4.t tVar = this.f446797d;
        if (tVar.f446812a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TranslationSpeechController", "Speech timeout");
            tVar.f446819h = 4;
            tVar.d();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjj));
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            ((qn4.w) this.f446798e).a(1001, "Speech timeout");
        }
    }
}

package rb5;

/* loaded from: classes11.dex */
public class e implements com.p314xaae8f345.mm.ui.p2740x696c9db.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb5.f f475399a;

    public e(rb5.f fVar) {
        this.f475399a = fVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.od
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "[onDrawed]");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rb5.f fVar = this.f475399a;
        fVar.f475400a = currentTimeMillis;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = fVar.f475401b.f475415f;
        if (c21628xcedb13ea == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingCompat", "chattingFragmet is null!");
            return;
        }
        if (c21628xcedb13ea.m78658x28280f95() != null) {
            fVar.f475401b.f475415f.m78658x28280f95().startAnimation(fVar.f475401b.f475417h);
        } else {
            fVar.f475401b.f475415f.m7474xfb86a31b().startAnimation(fVar.f475401b.f475417h);
        }
        fVar.f475401b.f475418i.m81107xd394853f(null);
    }
}

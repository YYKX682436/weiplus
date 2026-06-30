package h53;

/* loaded from: classes8.dex */
public class a implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h53.b f360573a;

    public a(h53.b bVar) {
        this.f360573a = bVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        sd.g gVar;
        h53.b bVar = this.f360573a;
        h53.j jVar = bVar.f360574a;
        jVar.f360591h = h53.i.inited;
        h53.q qVar = jVar.f360589f;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "ready");
        if (!qVar.f360599c) {
            qVar.f360598b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "flush");
            java.util.LinkedList linkedList = qVar.f360600d;
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                gVar = qVar.f360597a;
                if (!hasNext) {
                    break;
                }
                sd.e eVar = (sd.e) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "flush event name: %s, data: %s", eVar.b(), eVar.a());
                gVar.c(eVar);
            }
            linkedList.clear();
            java.util.LinkedList linkedList2 = qVar.f360601e;
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                h53.r rVar = (h53.r) it6.next();
                gVar.h(java.lang.String.format("WxGameJsCoreBridge.invokeEvent(%s,\"%s\")", rVar.f360602a, rVar.f360603b.toString()), null);
            }
            linkedList2.clear();
        }
        bVar.f360574a.b("inited");
    }
}

package bi2;

/* loaded from: classes10.dex */
public class a extends gi2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // gi2.d
    public gi2.g b() {
        jz5.g gVar = ci2.h.f41682b;
        gi2.g gVar2 = (gi2.g) ((jz5.n) ci2.h.f41682b).getValue();
        kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.chatvoiceroom.adapter.FinderLiveChatVoiceRoomAdapter.getMicLayout>");
        return gVar2;
    }

    @Override // gi2.d
    public void d(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).l(pm2.a.f356865u, g(i17));
        }
    }

    @Override // gi2.e
    public android.view.View f(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f272271e;
        lj2.v0 v0Var = this.f272270d;
        android.content.Context context = this.f272269c;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.view.View(context) : new di2.e(context, v0Var, x0Var, false) : new di2.j(context, v0Var, x0Var, false) : new di2.d(context, v0Var, x0Var, false);
    }

    @Override // gi2.e
    public java.lang.String i() {
        return "FinderLiveChatVoiceRoomAdapter";
    }

    @Override // gi2.e
    public void j(java.util.LinkedList data, android.graphics.Rect viewRect) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(viewRect, "viewRect");
        com.tencent.mars.xlog.Log.i("FinderLiveChatVoiceRoomAdapter", "updateData data: " + data);
        e(data);
        java.util.LinkedList linkedList = this.f272273g;
        linkedList.clear();
        linkedList.addAll(data);
        if (data.size() < 4) {
            int size = data.size();
            while (size < 4) {
                size++;
                linkedList.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, size, 0, 0, true, 0, 0, 0L, 1888, null)));
            }
        } else {
            int size2 = data.size();
            boolean z17 = false;
            if (4 <= size2 && size2 < 9) {
                z17 = true;
            }
            if (z17) {
                linkedList.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, data.size() + 1, 0, 0, true, 0, 0, 0L, 1888, null)));
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveChatVoiceRoomAdapter", "updateData size: " + linkedList.size());
        if (linkedList.size() > 9) {
            com.tencent.mars.xlog.Log.e("FinderLiveChatVoiceRoomAdapter", "updateData data size > 9");
        }
        c();
    }
}

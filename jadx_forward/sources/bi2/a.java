package bi2;

/* loaded from: classes10.dex */
public class a extends gi2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // gi2.d
    public gi2.g b() {
        jz5.g gVar = ci2.h.f123215b;
        gi2.g gVar2 = (gi2.g) ((jz5.n) ci2.h.f123215b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.custom.IMicLayout<Layout of com.tencent.mm.plugin.finder.live.mic.chatvoiceroom.adapter.FinderLiveChatVoiceRoomAdapter.getMicLayout>");
        return gVar2;
    }

    @Override // gi2.d
    public void d(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).l(pm2.a.f438398u, g(i17));
        }
    }

    @Override // gi2.e
    public android.view.View f(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f353804e;
        lj2.v0 v0Var = this.f353803d;
        android.content.Context context = this.f353802c;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.view.View(context) : new di2.e(context, v0Var, x0Var, false) : new di2.j(context, v0Var, x0Var, false) : new di2.d(context, v0Var, x0Var, false);
    }

    @Override // gi2.e
    public java.lang.String i() {
        return "FinderLiveChatVoiceRoomAdapter";
    }

    @Override // gi2.e
    public void j(java.util.LinkedList data, android.graphics.Rect viewRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRect, "viewRect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatVoiceRoomAdapter", "updateData data: " + data);
        e(data);
        java.util.LinkedList linkedList = this.f353806g;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatVoiceRoomAdapter", "updateData size: " + linkedList.size());
        if (linkedList.size() > 9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveChatVoiceRoomAdapter", "updateData data size > 9");
        }
        c();
    }
}

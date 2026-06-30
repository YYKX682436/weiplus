package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class aa implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64037b;

    public aa(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI, java.lang.String str) {
        this.f64036a = roomStillNotifyMessageManagerUI;
        this.f64037b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = 447;
        objArr[1] = java.lang.Integer.valueOf(fVar.f70616b);
        objArr[2] = java.lang.Integer.valueOf(fVar.f70615a);
        java.lang.String str = fVar.f70617c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", objArr);
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64036a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = roomStillNotifyMessageManagerUI.f63878n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            androidx.appcompat.app.AppCompatActivity context = roomStillNotifyMessageManagerUI.getContext();
            java.lang.String str2 = fVar.f70617c;
            java.lang.String string = roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.f493408k22);
            if (str2 == null) {
                str2 = string;
            }
            db5.e1.s(context, str2, roomStillNotifyMessageManagerUI.getString(com.tencent.mm.R.string.f490573yv));
            return null;
        }
        java.util.ArrayList arrayList = roomStillNotifyMessageManagerUI.f63877m;
        java.util.Iterator it = arrayList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (((com.tencent.mm.storage.z3) next).d1().equals(this.f64037b)) {
                it.remove();
            }
        }
        com.tencent.mm.chatroom.ui.preference.StillNotifyMessageManagerFollowMemberPreference W6 = roomStillNotifyMessageManagerUI.W6();
        if (W6 == null) {
            return null;
        }
        W6.N(arrayList);
        return null;
    }
}

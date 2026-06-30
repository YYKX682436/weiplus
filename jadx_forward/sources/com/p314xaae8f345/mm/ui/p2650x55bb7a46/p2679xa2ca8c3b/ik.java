package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ik implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f285724d;

    /* renamed from: e, reason: collision with root package name */
    public final db5.n4 f285725e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fk(this);

    /* renamed from: f, reason: collision with root package name */
    public final db5.t4 f285726f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gk(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f285727g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f285728h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f285729i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f285730m;

    /* renamed from: n, reason: collision with root package name */
    public rl5.r f285731n;

    public ik(yb5.d dVar) {
        this.f285724d = dVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "open menu but tag is null");
        } else {
            rl5.r rVar = this.f285731n;
            if (rVar != null) {
                rVar.a();
                this.f285731n = null;
            }
            yb5.d dVar = this.f285724d;
            rl5.r rVar2 = new rl5.r(dVar.g());
            this.f285731n = rVar2;
            rVar2.C = true;
            rVar2.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hk(this, view);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            this.f285731n.f(view, this.f285725e, this.f285726f, iArr[0] + ((int) (view.getWidth() / 2.0f)), iArr[1]);
            dVar.P(false);
            dVar.V(false);
            dVar.f542261w = false;
        }
        if (view.findViewById(com.p314xaae8f345.mm.R.id.i2h) != null) {
            view.findViewById(com.p314xaae8f345.mm.R.id.i2h).setBackgroundColor(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        } else if (view.findViewById(com.p314xaae8f345.mm.R.id.f565630d03) != null) {
            view.findViewById(com.p314xaae8f345.mm.R.id.f565630d03).setBackgroundColor(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

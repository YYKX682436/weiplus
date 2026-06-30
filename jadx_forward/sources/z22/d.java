package z22;

/* loaded from: classes10.dex */
public final class d extends z22.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f551247d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f551248e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13396xea536474 f551249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z22.f fVar, android.view.View itemView) {
        super(fVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f551247d = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.da9);
        this.f551248e = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.da_);
        this.f551249f = (com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13396xea536474) itemView.findViewById(com.p314xaae8f345.mm.R.id.dae);
        itemView.setOnClickListener(new z22.c(this, fVar));
    }

    @Override // z22.a
    public void i(int i17, r45.p64 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        vo0.d dVar = u85.p.f507254a;
        wo0.c a17 = u85.p.f507254a.a(new u85.a(info));
        android.widget.ImageView imageView = this.f551247d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(imageView);
        this.f551248e.setText(info.f464327f);
        this.f551249f.a(info.f464325d);
    }
}

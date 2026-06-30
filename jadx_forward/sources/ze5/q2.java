package ze5;

/* loaded from: classes8.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f553692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.s2 f553694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ot0.q qVar, yb5.d dVar, ze5.s2 s2Var) {
        super(1);
        this.f553692d = qVar;
        this.f553693e = dVar;
        this.f553694f = s2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a11.c sourceViewHolder = (a11.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceViewHolder, "sourceViewHolder");
        ot0.q qVar = this.f553692d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430179d);
        android.widget.TextView textView = sourceViewHolder.f82039c;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = sourceViewHolder.f82038b;
        if (K0) {
            android.view.View view = sourceViewHolder.f82037a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(8);
            c22699x3dcdb352.setVisibility(8);
        } else {
            android.view.View view2 = sourceViewHolder.f82037a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
            java.lang.String str = qVar.H;
            yb5.d dVar = this.f553693e;
            if (str == null) {
                str = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(dVar.g(), qVar.f430179d);
            }
            textView.setText(str);
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(qVar.f430179d, 2, i65.a.g(dVar.g()));
            if (Di == null || Di.isRecycled()) {
                c22699x3dcdb352.setVisibility(8);
            } else {
                c22699x3dcdb352.setVisibility(0);
                this.f553694f.getClass();
                c22699x3dcdb352.m82040x7541828(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
                int dimension = (int) dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
                bitmapDrawable.setBounds(0, 0, dimension, dimension);
                c22699x3dcdb352.setImageDrawable(bitmapDrawable);
                c22699x3dcdb352.setImageBitmap(Di);
            }
        }
        return jz5.f0.f384359a;
    }
}

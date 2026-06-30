package mx0;

/* loaded from: classes5.dex */
public final class y5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        super(1);
        this.f413985d = c10977x8e40eced;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        jz5.l lVar = (jz5.l) obj;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingPluginLayout", "beginCrop failed");
        } else {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413985d;
            m47319x71e92c1d = c10977x8e40eced.m47319x71e92c1d();
            android.content.Context context = c10977x8e40eced.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575(context, null, 0, 6, null);
            c10986x82320575.setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
            c10986x82320575.f((com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63) lVar.f384366d, (android.graphics.Bitmap) lVar.f384367e);
            c10986x82320575.m47388x84f845fd(new mx0.x5(c10977x8e40eced, c10986x82320575, m47319x71e92c1d));
            m47319x71e92c1d.addView(c10986x82320575);
            c10977x8e40eced.L1 = c10986x82320575;
        }
        return jz5.f0.f384359a;
    }
}

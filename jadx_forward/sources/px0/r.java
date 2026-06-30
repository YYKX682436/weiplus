package px0;

/* loaded from: classes5.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc) {
        super(1);
        this.f440340d = c10988x551cb0cc;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Throwable) obj) instanceof java.util.concurrent.CancellationException) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440340d;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = c10988x551cb0cc.f151186q;
            if (c10977x8e40eced != null) {
                c10977x8e40eced.z0();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialImportPreviewFragment", "onAsyncRemindConfirm cancel asyncAigcTaskId:" + c10988x551cb0cc.f151188s);
        }
        return jz5.f0.f384359a;
    }
}

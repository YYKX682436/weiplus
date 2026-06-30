package r04;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr04/d;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lr04/b;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "plugin-sec-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d extends com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b<r04.b> {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f449889h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n75.b dbProvider) {
        super(dbProvider);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbProvider, "dbProvider");
        this.f449889h = "MicroMsg.SecData.SecReportDataInfoStorage";
    }

    @Override // com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b, l75.c1
    /* renamed from: O6, reason: from getter */
    public java.lang.String getF449889h() {
        return this.f449889h;
    }

    public final r04.b X6(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(dm.i4.f66865x76d1ec5a, id6);
        return (r04.b) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(r04.b.class));
    }
}

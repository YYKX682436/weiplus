package com.tencent.mm.plugin.appbrand.jsapi.transitcard.task;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0016R6\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000ej\u0004\u0018\u0001`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Lhe1/h;", "B", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "in", org.chromium.base.BaseSwitches.V, "Lkotlin/Function1;", "Lhe1/k;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/model/TransitCardCallback;", "n", "Lyz5/l;", "D", "()Lyz5/l;", "F", "(Lyz5/l;)V", "resultCallback", "<init>", "()V", "parcel", "(Landroid/os/Parcel;)V", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class AbsTransitCardTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83472f;

    /* renamed from: g, reason: collision with root package name */
    public int f83473g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83474h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f83475i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f83476m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public transient yz5.l resultCallback;

    public AbsTransitCardTask() {
        this.f83472f = "";
        this.f83474h = "";
        this.f83475i = "";
    }

    public abstract he1.h B();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0147 A[Catch: InterruptedException -> 0x0173, TRY_LEAVE, TryCatch #1 {InterruptedException -> 0x0173, blocks: (B:14:0x013c, B:16:0x0147), top: B:13:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask.C():void");
    }

    /* renamed from: D, reason: from getter */
    public final yz5.l getResultCallback() {
        return this.resultCallback;
    }

    public void E(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
    }

    public final void F(yz5.l lVar) {
        this.resultCallback = lVar;
    }

    public void G(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        super.v(in6);
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        this.f83472f = readString;
        this.f83476m = in6.readInt() == 1;
        this.f83473g = in6.readInt();
        java.lang.String readString2 = in6.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.f83474h = readString2;
        java.lang.String readString3 = in6.readString();
        this.f83475i = readString3 != null ? readString3 : "";
        E(in6);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeString(this.f83472f);
        dest.writeInt(this.f83476m ? 1 : 0);
        dest.writeInt(this.f83473g);
        dest.writeString(this.f83474h);
        dest.writeString(this.f83475i);
        G(dest, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.Task", "runInClientProcess, isSuccess=" + this.f83476m + ", errCode=" + this.f83473g);
        java.lang.Object jVar = this.f83476m ? new he1.j(this.f83475i) : new he1.i(this.f83473g, this.f83474h);
        yz5.l lVar = this.resultCallback;
        if (lVar != null) {
            lVar.invoke(jVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        C();
        c();
    }

    public AbsTransitCardTask(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f83472f = "";
        this.f83474h = "";
        this.f83475i = "";
        v(parcel);
    }
}

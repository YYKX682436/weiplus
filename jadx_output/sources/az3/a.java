package az3;

/* loaded from: classes9.dex */
public class a implements zy3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az3.b f16162a;

    public a(az3.b bVar) {
        this.f16162a = bVar;
    }

    public void a(int i17, int i18, java.lang.String str) {
        az3.b bVar = this.f16162a;
        if (i17 != 0 || i18 != 0) {
            bVar.a(2, null);
            return;
        }
        com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent = new com.tencent.mm.autogen.events.ScanBankCardResultEvent();
        am.qs qsVar = scanBankCardResultEvent.f54727g;
        qsVar.f7741a = str;
        qsVar.f7742b = null;
        scanBankCardResultEvent.e();
        bVar.a(3, null);
    }
}

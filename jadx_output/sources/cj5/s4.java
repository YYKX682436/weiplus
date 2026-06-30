package cj5;

/* loaded from: classes.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f42235d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return com.tencent.mm.sdk.platformtools.t8.O1(this.f42235d.getIntent().getStringExtra("custom_contact"), ",");
    }
}
